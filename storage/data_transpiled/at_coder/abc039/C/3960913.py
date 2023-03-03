def main ( * args ) :
    import os
    from string import ascii_letters
    sc = open ( '/etc/init.d' , 'r' )
    S = sc.read ( )
    index = S.find ( 'WWBWBWW' )
    map = [ 'Si' , 'Do' , '#' , 'Re' , '#' , 'Mi' , 'Fa' , '#' , 'So' , '#' , 'La' , '#' , 'Si' ]
    print ( map [ 12 - index ] )
