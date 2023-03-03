def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = Scanner ( )
    st = sc.next ( )
    num = len ( st )
    is_black = [ char in ascii_lowercase for char in st ]
    same_color = [ ]
    tmp = tmp_is_black = True
    for char in ascii_lowercase :
        if char != tmp_is_black :
            same_color.append ( tmp )
            tmp = 0
            tmp_is_black = not tmp_is_black
        tmp += 1
    same_color.append ( tmp )
    count = 0
    while len ( same_color ) >= 2 :
        if len ( same_color ) <= 1 :
            break
        count += long ( same_color [ 0 ] * same_color [ 1 ] )
        same_color.pop ( 1 )
        if len ( same_color ) <= 1 :
            break
        same_color [ 1 ] = same_color [ 0 ] + same_color [ 1 ]
        same_color.pop ( 0 )
    print ( count )
