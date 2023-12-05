def import _readline
class B ( object ) :
    def __init__ ( self ) :
        sc = _readline ( )
        t = sc.__next__ ( )
        sc.__next__ ( )
        for i in range ( t ) :
            print ( "Case #%d: %s\n" % ( i + 1 , self.exec ( ) ) )
    def exec ( ) :
        n = sc.__next__ ( )
        s1 = [ s for s in sc.split ( ) if s != 0 ]
        s2 = [ s for s in sc.split ( ) if s != 0 ]
        stars = 0
        goal = n * 2
        obtained = [ ]
        plays = 0
        loop :
        while stars < goal :
            for i in range ( n ) :
                if s2 [ i ] > stars :
                    continue
                if obtained [ i ] == 2 :
                    continue
                stars += 2 - obtained [ i ]
                obtained.append ( 2 )
                plays += 1
                continue loop
            s2of_winner = - 1
            idx_of_winner = - 1
            for i in range ( n ) :
                if obtained [ i ] != 0 :
                    continue
                if s1 [ i ] > stars :
                    continue
                if s2 [ i ] < s2of_winner :
                    continue
                s2of_winner = s2 [ i ]
                idx_of_winner = i
            if s2of_winner == - 1 :
                return "Too Bad"
            stars += 1
            obtained [ idx_of_winner ] = 1
            plays += 1
        return str ( plays )
