def main ( ) :
    import sys
    from string import printable
    stdin = sys.stdin
    for x in stdin :
        i , j = 0 , 0
        x = x.strip ( )
        for k in range ( 1 , len ( x ) + 1 ) :
            xx = x [ k - 1 : k ]
            if xx == 'S' :
                i += 1
            else :
                i -= 1
            if i < 0 :
                j += 1
                i = 0
        sys.stdout.write ( j * 2 )
