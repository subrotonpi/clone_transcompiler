def main ( ) :
    import sys
    from string import printable
    ans = 0
    for i in range ( 0 , 12 ) :
        b = printable.join ( b )
        for i in range ( 0 , len ( b ) ) :
            c = printable.join ( b )
            if c == 'r' :
                ans += 1
                break
    print ( ans )
