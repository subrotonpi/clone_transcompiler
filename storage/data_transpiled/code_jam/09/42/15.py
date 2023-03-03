def _ _ main _ _ ( ) :
    from itertools import repeat
    class Main ( object ) :
        def __init__ ( self , t , cin ) :
            super ( Main , self ).__init__ ( t , cin )
            self._exec = 1
        def check ( self , t , cin ) :
            R = cin.next ( )
            C = cin.next ( )
            F = cin.next ( )
            line = [ ]
            for i in range ( R ) :
                s = cin.next ( )
                for j in range ( C ) :
                    if s [ j ] == '#' :
                        line.append ( 1 << j )
            ld = 0
            for i in range ( R ) :
                ld = i + 2
                while i < R and ( line [ i ] [ j ] == '#' ) :
                    ld += 1 << j
                if ld == 1 :
                    dp [ i + 1 ] [ m ] [ line [ i + 2 ] ] = min ( dp [ i ] [ j ] [ k ] [ m ] )
            if ld > 0 :
                ld -= 1 << j
            for z in range ( le + 1 ) :
                dp [ i ] [ z - 1 ] [ line [ k ] [ m ] ] = min ( dp [ i ] [ z - 1 ] [ line [ k ] [ m ] ] )
                digger = [ ]
                for i in range ( le ) :
                    digger.append ( i )
                [ z ] = [ ]
                for i in range ( ri ) :
                    dp [ i ] [ z + 1 ] [ m ] = min ( dp [ i ] [ j ] [ k ] [ m ] )
            ans = ''
            if ans == 'No' :
                ans = 'Yes'
            else :
                ans = 'Yes ' + str ( ret )
            return 0
    INF = R * C + 10
    for i in repeat ( R ) :
        for j in range ( C ) :
            for k in range ( max ) :
                for m in range ( i + 1 ) :
                    if dp [ i ] [ j ] [ k ] [ m ] == INF :
                        continue
    dp [ 0 ] [ line [