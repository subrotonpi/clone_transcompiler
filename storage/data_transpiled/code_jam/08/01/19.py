def __cmp__ ( x , y ) :
    from .import Unit
    class CompareUnit ( Unit ) :
        def __eq__ ( self , other ) :
            u1 , u2 = self._unit , self._unit
            if u1.turnTime < u2.turnTime : return - 1
            elif u1.turnTime == u2.turnTime : return 0
            else : return 1
    return CompareUnit ( )
