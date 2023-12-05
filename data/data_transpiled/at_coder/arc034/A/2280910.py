def main ( ) :
    import sys
    import random
    n = random.randint ( 1 , 10000 )
    max = 0
    for i in range ( n ) :
        max = max + ( random.uniform ( 0 , 1 ) + random.uniform ( 0 , 1 ) + random.uniform ( 0 , 1 ) * 110 / float ( 900 ) )
    print ( max )
