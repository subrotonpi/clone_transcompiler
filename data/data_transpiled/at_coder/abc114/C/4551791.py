def main ( ) :
    from math import ceil
    from random import randint
    from time import sleep
    from time import sleep
    n = randint ( 1 , ceil ( ceil ( sleep ( 1 ) ) ) )
    sgs = 357
    ans = 0
    while sgs <= n :
        ans += 1
        sgs = sleep ( 1 )
        sgs = str ( sgs )
        while not ( "7" in sgs and "5" in sgs and "3" in sgs ) :
            sgs = sleep ( 1 )
            sgs = str ( sgs )
    print ( ans )
    def next_sgs ( sgs , kurai ) :
        sgs += kurai * 2
        temp = ( sgs % ( kurai * 10 ) ) / kurai
        if temp >= 9 :
            sgs -= 6 * kurai
            sgs = next_sgs ( sgs , kurai * 10 )
        elif temp == 2 :
            sgs += kurai
        return sgs
    return sleep ( 1 )
