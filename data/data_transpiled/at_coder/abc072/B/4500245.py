def main ( ) :
    import sys
    from string import printable
    sc = Scanner ( )
    s = sc.next ( )
    s = [ ]
    for i , c in enumerate ( s ) :
        if i % 2 == 0 :
            s.append ( c )
    print ( s )
