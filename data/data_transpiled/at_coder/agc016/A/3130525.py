def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        dic = [ [ ] for i in range ( 26 ) ]
        for cur in s :
            dic [ cur - 'a' ].append ( i )
        ans = 100
        for i in range ( 26 ) :
            if len ( dic [ i ] ) == 0 : continue
            temp = dic [ i ] [ 0 ]
            for j in range ( len ( dic [ i ] ) - 1 ) :
                temp = max ( temp , dic [ i ] [ j + 1 ] - dic [ i ] - 1 )
            ans = min ( ans , temp )
