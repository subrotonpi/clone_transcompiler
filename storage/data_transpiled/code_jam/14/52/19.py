def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve = 0
        def solve ( self ) :
            with open ( "input.txt" , "r" ) as cin :
                T = cin.read ( )
                for C in range ( 1 , T + 1 ) :
                    P , Q , N = cin.read ( )
                    HP = [ ]
                    GOLD = [ ]
                    for i in range ( N ) :
                        HP.append ( cin.read ( ) )
                        GOLD.append ( cin.read ( ) )
                    print ( "Case #%d: %d" % ( C , solve ( P , Q , HP , GOLD , N ) ) )
        def solve ( self , P , Q , HP , GOLD , N ) :
            SIZE = N * 10 + 100
            score = [ 1 ] * SIZE
            for i in range ( N ) :
                next = [ ]
                turn = HP [ i ] // Q
                rest = HP [ i ] - Q * turn
                if rest == 0 :
                    rest = Q
                    turn -= 1
                req = ( rest + P - 1 ) // P
                for j in range ( SIZE ) :
                    if score [ j ] == 0 :
                        continue
                    index = j + turn + 1
                    next [ index ] = max ( next [ index ] , score [ j ] )
                    if req <= j + turn :
                        index2 = j + turn - req
                        next [ index2 ] = max ( next [ index2 ] , score [ j ] + GOLD [ i ] )
                score = next
        ret = 0
        for i in range ( SIZE ) :
            ret = max ( ret , score [ i ] )
        return ret - 1
