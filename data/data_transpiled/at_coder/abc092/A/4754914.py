def main ( ) :
    import sys
    from os import path
    from os import path
    from os import environ
    a = int ( environ.get ( 'A' , 0 ) )
    b = int ( environ.get ( 'B' , 0 ) )
    c = int ( environ.get ( 'C' , 0 ) )
    d = int ( environ.get ( 'D' , 0 ) )
    sum = 0
    if a > b :
        sum += b
    else :
        sum += a
    if c > d :
        sum += d
    else :
        sum += c
    print ( sum )
