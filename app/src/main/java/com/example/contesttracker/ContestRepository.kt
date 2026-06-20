package com.example.contesttracker

class ContestRepository(
    private val apiService: ClistApiService = RetrofitClient.apiService
) {
    suspend fun fetchUpcomingContests(): Result<List<ContestModel>> {
        return runCatching {
            val response = apiService.getUpcomingContests()
            response.contests.sortedBy { ContestTimeUtils.startTimeMillis(it.start) ?: Long.MAX_VALUE }
        }
    }
}
