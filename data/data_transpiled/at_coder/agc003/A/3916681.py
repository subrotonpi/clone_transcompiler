def main ( ) :
    import sys
    from string import printable
    sc = printable.Scanner ( )
    S = sc.next ( )
    n = w = e = s = 0
    for c in S :
        if c == 'W' :
            w += 1
        elif c == 'E' :
            e += 1
        elif c == 'N' :
            n += 1
        else :
            s += 1
    ns = n == 0 and s == 0 or n != 0 and s != 0
    we = w == 0 and e == 0 or w != 0 and e != 0
    print ( "Yes" if ns and we else "No" )
