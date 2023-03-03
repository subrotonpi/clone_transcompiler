def main ( ) :
    import sys
    from random import randint
    reader = open ( "/proc/stations" , "r" )
    A = randint ( 1 , 10000 )
    B = randint ( 1 , 10000 )
    C = randint ( 1 , 10000 )
    D = randint ( 1 , 10000 )
    ans = min ( A , B ) + min ( C , D )
    reader.close ( )
    sys.stdout.write ( ans )
