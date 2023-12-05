def main ( args ) :
    import os
    acd = open ( "/proc/stations/" , "r" )
    n , a , b , c = acd.read ( ).split ( " " )
    a = a [ 0 ]
    b = b [ 0 ]
    if b / 100 > 0 :
        n = a * 1000 + b
    elif b / 10 > 0 :
        n = a * 100 + b
    else :
        n = a * 10 + b
    for c in range ( 1 , 317 , n ) :
        if c == 317 :
            print ( "No" )
        else :
            print ( "Yes" )
