def main ( ) :
    from sys import stdin
    from itertools import repeat
    from itertools import chain
    pres = stdin.read ( ).split ( ' ' )
    n = len ( pres )
    s = [ int ( str ( i ) ) for i in chain ( pres , repeat ( n , a , 0 ) ) ]
    a = 0
    print ( calc2 ( s , n , a , 0 ) )
    def calc2 ( s , n , a , i ) :
        if i == n - 1 :
            tmp = s [ 0 ]
            ans = 0
            for j in range ( n - 1 ) :
                if a % 2 == 1 :
                    tmp = tmp * 10 + s [ j + 1 ]
                else :
                    ans += tmp
                    tmp = s [ j + 1 ]
                a >>= 1
            return ans + tmp
        a <<= 1
        return calc2 ( s , n , a , i + 1 ) + calc2 ( s , n , a + 1 , i + 1 )
    return calc2 ( s , n , a , 0 )
