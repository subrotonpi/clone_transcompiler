def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    S = sc.next ( )
    ans = ascii_letters
    seen = set ( )
    for letter in S :
        ans.add ( letter )
    for letter in ( 'a' , 'z' , 'a' , 'a' , 'a' , 'a' , 'z' ) :
        if len ( ans ) == 26 :
            print ( 'None' )
            break
        if chr ( letter ) not in seen :
            print ( chr ( letter ) )
            break
