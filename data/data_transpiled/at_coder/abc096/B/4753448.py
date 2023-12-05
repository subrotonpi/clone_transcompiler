def main ( ) :
    import sys
    from math import pow
    from random import randint
    A , B , C , K , D , E , max , ans = 0 , 0 , 0 , 0 , 0
    A , B , C , K , D , E , max , ans = randint ( 1 , min ( A , B ) ) , randint ( 1 , max ( A , B ) ) , randint ( 1 , max ( A , C ) ) , randint ( 1 , max ( D , C ) ) , randint ( 1 , max ( D , C ) )
    for i in range ( K ) :
        max = E * 2
    ans = A + B + C - E
    ans += E * pow ( 2.0 , float ( K ) )
    print ( ans )
    sys.exit ( ans )
