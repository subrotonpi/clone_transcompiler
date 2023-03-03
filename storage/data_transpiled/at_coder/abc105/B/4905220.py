def main ( args ) :
    import sys
    from time import sleep
    sc = Scanner ( )
    N = sc.__next__ ( )
    limit7 = N // 7
    check = False
    for i in range ( 0 , limit7 ) :
        left = N - ( i * 7 )
        if left % 4 == 0 :
            check = True
    if check :
        print ( "Yes" )
    else :
        print ( "No" )
