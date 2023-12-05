def main ( ) :
    import sys
    from math import pow
    from random import randint
    A , B , C , K , D , E , max , max1 = randint ( 1 , 5 ) , randint ( 1 , 5 ) , randint ( 1 , 5 ) , randint ( 1 , 5 ) , randint ( 1 , 5 )
    A , B , C , K , D , E , max = randint ( 1 , 5 ) , randint ( 1 , 5 ) , randint ( 1 , 5 ) , randint ( 1 , 5 ) , randint ( 1 , 5 )
    for i in range ( K ) :
        max = E * 2
    max1 = A + B + C - E
    max1 += E * pow ( 2.0 , float ( K ) )
    print ( max1 )
    sys.exit ( max )
