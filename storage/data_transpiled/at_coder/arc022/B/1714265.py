def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.count ( 'N' )
        a = [ ]
        for i in range ( N ) :
            a.append ( sc.choice ( a ) )
    seen = [ ]
    s = 0
    ans = 1
    seen.append ( a [ 0 ] )
    for t in range ( 1 , N ) :
        if a [ t ] in seen :
            while a [ t ] in seen :
                seen.remove ( a [ s ] )
                s += 1
            seen.append ( a [ t ] )
            ans = max ( ans , t - s + 1 )
        else :
            seen.append ( a [ t ] )
            ans = max ( ans , t - s + 1 )
    print ( ans )
