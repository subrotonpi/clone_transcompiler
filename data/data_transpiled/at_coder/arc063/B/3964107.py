def main ( ) :
    import sys
    from time import sleep
    sc = Scanner ( )
    n = sc.nextInt ( )
    t = sc.nextInt ( )
    min = 1000000000
    dif = 0
    ans = 0
    for i in range ( n ) :
        a = sc.nextInt ( )
        if a < min :
            min = a
        elif dif == a - min :
            ans += 1
        elif dif < a - min :
            dif = a - min
            ans = 1
    print ( ans )
