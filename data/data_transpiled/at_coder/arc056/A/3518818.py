def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos , tan
    A , B , K , L = map ( lambda x : round ( x , 2 ) , range ( 10 ) )
    sys.stdout.flush ( )
    ans = 0
    if K >= L :
        ans = B * ( K / L )
        K %= L
    if K * A <= B :
        ans += K * A
    else :
        ans += B
    print ( ans )
