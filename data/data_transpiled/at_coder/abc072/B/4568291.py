def main ( ) :
    import sys
    from string import printable
    sc = sys.stdin.read ( )
    s = sc.split ( )
    for i , char in enumerate ( s ) :
        if i % 2 == 0 :
            sys.stdout.write ( char )
