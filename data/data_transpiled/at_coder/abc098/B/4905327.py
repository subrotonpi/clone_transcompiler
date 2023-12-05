def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = int ( sc.__next__ ( ) )
        s = sc.__next__ ( )
        max = 0
        for i in range ( 1 , len ( s ) ) :
            temp = s [ : i ]
            seen = set ( [ c for c in temp if c in seen ] )
            data = s [ i : ]
            cnt = 0
            for c in seen :
                for ch in data :
                    if c == ch :
                        cnt += 1
                        break
        max = max ( max , cnt )
    print ( max )
