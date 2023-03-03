def main ( ) :
    import math
    from os import path
    from os import path
    from os import path
    from os import stat
    score = 0
    n = stat.st_size
    if n == 1 :
        print ( "BOWWOW" )
        sys.exit ( )
    for i in range ( 0 , n ) :
        score += i
    for i in range ( 2 , math.sqrt ( score ) ) :
        if score % i == 0 :
            print ( "BOWWOW" )
            sys.exit ( )
    print ( "WANWAN" )
