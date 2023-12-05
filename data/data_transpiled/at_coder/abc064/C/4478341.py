def Main ( ) :
    global colors
    n , ans , colors = 0 , [ 0 ] * 9 , [ ]
    for i , temp in enumerate ( colors ) :
        if 1 <= temp <= 8 :
            ans += 1
        print ( max ( 1 , ans ) , ( ans , colors [ 8 ] ) )
    enum = { GRAY : ( 1 , 399 ) , BROWN : ( 400 , 799 ) , GREEN : ( 800 , 1199 ) , LIGHT_BLUE : ( 1200 , 1599 ) , BLUE : ( 1600 , 1999 ) , YELLOW : ( 2000 , 2399 ) , ORANGE : ( 2400 , 2799 ) , RED : ( 2800 , 3199 ) , FREE : ( 3200 , 4800 ) }
    def color ( ) :
        return enum [ 'color' ]
    def color ( rate ) :
        for color in values ( ) :
            if color.min <= rate <= color.max :
                return color
        return None
    return color
