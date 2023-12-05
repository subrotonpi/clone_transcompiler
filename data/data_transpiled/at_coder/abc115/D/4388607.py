def test_main ( ) :
    import sys
    class Main ( object ) :
        FIRST_SLICE_IS_BUN = 1
        MIDDLE_PATTY = 1
        def process ( self , case ) :
            N = case.N
            X = case.X
            return self.count_num_patty ( N , X )
        def num_patty ( self , X ) :
            if isinstance ( X , int ) :
                self.N = X
            else :
                self.N = X
    def num_patty ( self , X ) :
        if isinstance ( X , int ) :
            self.X = X
        else :
            self.N = X
    burgerLength = burgerLength ( N )
    isWholeBurgerEaten = X >= burgerLength
    if isWholeBurgerEaten :
        return num_patty ( self )
    else :
        isOnlyTopSliceRemaining = X == burgerLength - 1
        oneSmallerLayerLength = burgerLength ( N - 1 )
        oneSmallerLayerPatty = num_patty ( N - 1 )
        if isOnlyTopSliceRemaining :
            return num_patty ( self )
        else :
            canFinishHalfBurger = X >= ( burgerLength - FIRST_SLICE_IS_BUN - oneSmallerLayerLength )
            if canFinishHalfBurger :
                return oneSmallerLayerPatty + MIDDLE_PATTY + num_patty ( self.N - 1 , X - FIRST_SLICE_IS_BUN - oneSmallerLayerLength - MIDDLE_PATTY )
            else :
                canFinishOneSmallerLayer = ( X - FIRST_SLICE_IS_BUN ) >= ( FIRST_SLICE_IS_BUN + oneSmallerLayerLength )
                if canFinishOneSmallerLayer :
                    return oneSmallerLayerPatty
                else :
                    canEatSomePatty = X > FIRST_SLICE_IS_BUN
                    if canEatSomePatty :
                        return num_patty ( self.N - 1 , X - FIRST_SLICE_IS_BUN )
                    else :
                        return None
