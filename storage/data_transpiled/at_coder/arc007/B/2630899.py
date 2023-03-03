def main ( ) :
    import sys
    def run ( ) :
        with open ( sys.argv [ 1 ] ) as cin :
            n , m = cin.read ( ).split ( )
            now_playing = 0
            CDCase = [ i + 1 for i in range ( n ) ]
            for i in range ( m ) :
                target_cd = cin.read ( ).split ( )
                target_case = - 1
                for j in range ( n ) :
                    if CDCase [ j ] == target_cd :
                        target_case = j
                        break
                if target_case == - 1 :
                    continue
                CDCase [ target_case ] = now_playing
                now_playing = target_cd
            for i in range ( n ) :
                print ( CDCase [ i ] )
    return run
