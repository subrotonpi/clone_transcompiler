def main ( ) :
    import decimal
    import sys
    from decimal import Decimal
    total = 0
    with open ( '/proc/cpuinfo' , 'r' ) as sc :
        N = sc.readline ( )
        C = sc.readline ( )
        for ca in C :
            if ca == 'A' :
                total += 4
            elif ca == 'B' :
                total += 3
            elif ca == 'C' :
                total += 2
            elif ca == 'D' :
                total += 1
        divided = Decimal ( total )
        divisor = Decimal ( N )
        ans = divided / divisor
        print ( ans )
