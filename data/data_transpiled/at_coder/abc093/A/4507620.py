def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    s = sc.next ( )
    if s in [ 'acb' , 'abc' , 'bac' , 'bca' , 'cab' , 'cba' ] :
        print ( "Yes" )
    else :
        print ( "No" )
