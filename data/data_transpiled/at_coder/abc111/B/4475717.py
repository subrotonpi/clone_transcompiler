def main ( ) :
    import sys
    from string import atoi
    input = input.read ( )
    N = input.strip ( )
    ns = [ ]
    for i in range ( 9 ) :
        num = i + 1
        ns.append ( num * 100 + num * 10 + num )
    ans = 1000
    for i in range ( 9 ) :
        if ns [ i ] >= int ( N ) and ns [ i ] < ans :
            ans = ns [ i ]
    sys.stdout.write ( ans )
