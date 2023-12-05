def main ( ) :
    import sys
    from math import sin , cos
    from math import log
    a , b = map ( int , sys.stdin.readlines ( ) )
    bin = bin ( b )
    ans = 0
    for i in range ( 0 , len ( bin ) ) :
        c = log ( a )
        if bin [ - 1 - i ] == '1' :
            ans += c
    print ( + ans )
