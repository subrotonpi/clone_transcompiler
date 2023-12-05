def main ( ) :
    import sys
    from os import urandom
    import random
    l = random.randint ( 0 , 256 ) + random.randint ( 0 , 256 )
    r = random.randint ( 0 , 256 ) + random.randint ( 0 , 256 )
    if l > r :
        print ( "Left" )
    elif l < r :
        print ( "Right" )
    else :
        print ( "Balanced" )
