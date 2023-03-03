def main ( ) :
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            h , w = sc.split ( )
            ta = [ ]
            for i , str in enumerate ( sc.read ( ) ) :
                for j in range ( w ) :
                    ta.append ( [ int ( str [ j ] ) - ord ( 'a' ) for j in range ( i , i + 1 ) ] )
            jun = [ i for i in range ( h ) ]
            nta = [ ]
            for k in range ( 100000 ) :
                for i in range ( h ) :
                    for j in range ( w ) :
                        nta.append ( [ jun [ i ] , j ] )
                if self.check ( nta ) :
                    print ( "YES" )
                    return
                self.shuffle ( jun )
            print ( "NO" )
        def check ( ta ) :
            h , w = len ( ta ) , len ( ta [ 0 ] )
            cent = False if ( w % 2 == 1 ) else True
            res = True
            jun = [ ]
            for i in range ( w ) :
                if jun [ i ] :
                    continue
                j = 0
                for j in range ( w ) :
                    if jun [ j ] :
                        continue
                    if i == j :
                        continue
                    itti = True
                    for k in range ( h ) :
                        if ta [ k ] [ i ] != ta [ h - k - 1 ] [ j ] :
                            itti = False
                            break
                    if itti :
                        break
                if j < w :
                    jun.append ( True )
                    jun.append ( True )
                else :
                    taisyo = True
                    for k in range ( h ) :
                        if ta [ k ] [ i ] != ta [ h - k - 1 ] [ i ] :
                            taisyo = False
                            break
            return res
    return Main
