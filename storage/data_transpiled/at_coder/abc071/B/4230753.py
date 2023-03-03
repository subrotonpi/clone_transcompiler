def main ( ) :
    import sys
    from string import printable
    sc = printable.read ( )
    s = sc.strip ( )
    for i in [ 'a' , 'z' ] :
        if s.find ( i ) >= 0 :
            continue
        else :
            print ( i )
            sys.exit ( 0 )
    print ( 'None' )
