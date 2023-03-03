def import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.number
        a = [ ]
        for i in range ( n ) :
            a.append ( i )
    seen = sorted ( )
    ans = 0
    for i , num in enumerate ( a ) :
        l = seen.lower ( num )
        r = seen.higher ( num )
        l = ( - 1 if l is None else l )
        r = ( n if r is None else r )
        ans += ( i + 1 ) * ( num - l ) * ( r - num )
        seen.add ( num )
    print ( ans )
