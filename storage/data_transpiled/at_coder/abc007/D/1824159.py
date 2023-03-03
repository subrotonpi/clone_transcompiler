def main ( ) :
    from string import ascii_lowercase
    from math import pow
    from math import sin , cos
    from math import cos
    from math import sin
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    from math import cos
    A , B = ascii_lowercase ( )
    a = str ( A ).decode ( 'ascii' )
    b = str ( B + 1 ).decode ( 'ascii' )
    print ( B - A + 1 - ( f ( b , 0 ) - f ( a , 0 ) ) )
    def f ( v , idx ) :
        if idx == len ( v ) :
            return 0
        ret = 0
        for i in range ( v [ idx ] - '0' ) :
            if i in ( 4 , 9 ) :
                continue
            ret += pow ( 8 , len ( v ) - 1 - idx )
        if v [ idx ] - '0' not in ( 4 , 9 ) :
            ret += f ( v , idx + 1 )
        return ret
    def pow ( a , n ) :
        ret = 1
        for _ in range ( n ) :
            if n % 2 == 1 :
                ret = ret * a
        return ret
    def tr ( * args ) :
        print ( " ".join ( map ( str , args ) ) )
    return tr
