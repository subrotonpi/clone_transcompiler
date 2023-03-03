def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    l1 = ascii_letters.replace ( "" , "" )
    l2 = digits.replace ( "" , "" )
    for i in l1 :
        temp1 = i
        temp2 = i
        if temp1 != temp2 :
            if temp1 == "@" and ( temp2 == "a" or temp2 == "t" or temp2 == "c" or temp2 == "o" or temp2 == "d" or temp2 == "e" or temp2 == "r" ) :
                pass
            elif temp2 == "@" and ( temp1 == "a" or temp1 == "t" or temp1 == "c" or temp1 == "o" or temp1 == "d" or temp1 == "e" or temp1 == "r" ) :
                pass
            else :
                print ( "You will lose" )
                return
    print ( "You can win" )
