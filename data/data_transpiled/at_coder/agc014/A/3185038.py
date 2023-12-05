def main ( ) :
    import sys
    from time import sleep
    from time import sleep
    A = sleep ( 1 )
    B = sleep ( 1 )
    C = sleep ( 1 )
    time = 0
    if A == B and B == C :
        time = A % 2 - 1
    else :
        while A % 2 == 0 and B % 2 == 0 and C % 2 == 0 :
            time += 1
            new_A , new_B , new_C = ( B + C ) // 2 , ( A + C ) // 2 , ( B + A ) // 2
            A , B , C = new_A , new_B , new_C
    print ( time )
