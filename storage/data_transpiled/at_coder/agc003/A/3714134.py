def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    S = sc.next ( )
    ans = "No"
    if S in [ "N" , "S" , "E" , "W" ] :
        ans = "Yes"
    if S in [ "N" , "S" , "E" , "W" ] :
        ans = "Yes"
    if not S in [ "N" , "S" , "E" , "W" ] :
        ans = "Yes"
    print ( ans )
