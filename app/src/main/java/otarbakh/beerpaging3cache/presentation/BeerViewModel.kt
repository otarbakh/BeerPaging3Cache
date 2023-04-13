package otarbakh.beerpaging3cache.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.cachedIn
import androidx.paging.map
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import otarbakh.beerpaging3cache.data.local.BeerEntity
import otarbakh.beerpaging3cache.data.mappers.toBeer
import javax.inject.Inject

@HiltViewModel
class BeerViewModel @Inject constructor(
    pager :Pager<Int, BeerEntity>
): ViewModel() {

    val beerPagingFlow = pager
        .flow
        .map { pagingData ->
            pagingData.map { it.toBeer() }
        }
        .cachedIn(viewModelScope)

}