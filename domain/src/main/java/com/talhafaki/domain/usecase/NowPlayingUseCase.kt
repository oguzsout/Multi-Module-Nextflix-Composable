package com.talhafaki.domain.usecase

import com.talhafaki.domain.entity.Movies
import com.talhafaki.domain.gateway.NextflixGateway
import javax.inject.Inject

/**
 * Created by tfakioglu on 14.December.2021
 */
class NowPlayingUseCase  @Inject constructor(
    private val nextflixGateway: NextflixGateway,
) {

    suspend operator fun invoke(page: Int): Movies {
        return nextflixGateway.getNowPlayingMovies(page)
    }
}