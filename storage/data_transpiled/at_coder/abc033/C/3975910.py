def main ( ) :
    import sys
    from string import printable
    S = printable ( S )
    count = 0
    a = S.split ( '+' )
    for i in a :
        if '0' not in i :
            count += 1
    print ( count )
