def main ( ) :
    import sys
    from itertools import count
    sc = Scanner ( )
    N = sc.__next__ ( )
    A = sc.__next__ ( )
    B = sc.__next__ ( )
    count = 0
    aflag = False
    bflag = False
    while 1 :
        if count % 2 == 0 :
            N -= A
            if N <= 0 :
                aflag = True
                break
        else :
            N -= B
            if N <= 0 :
                bflag = True
                break
        count += 1
    if aflag :
        print ( "Ant" )
    if bflag :
        print ( "Bug" )
