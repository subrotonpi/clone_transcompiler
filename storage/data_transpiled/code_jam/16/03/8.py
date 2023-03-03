def main ( ) :
    import sys
    from math import pow
    from math import ceil
    N = 32
    J = 500
    print ( "Case #1:" )
    for i in range ( J ) :
        bitmask = bin ( i )
        while len ( bitmask ) + 2 < N / 2 :
            bitmask = '0' + bitmask
        divisor = '1%s1' % bitmask
        jamcoin = divisor + divisor
        sys.stdout.write ( jamcoin )
        for base in range ( 2 , 10 + 1 ) :
            sys.stdout.write ( " " + pow ( divisor , base ) )
        sys.stdout.write ( "\n" )
