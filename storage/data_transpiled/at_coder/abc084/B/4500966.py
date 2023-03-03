def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    from string import digits
    a = digits.index ( 'a' )
    b = digits.index ( 'b' )
    length = a + b + 1
    post = digits.index ( 'post' )
    c = post [ a ]
    start = post [ : a ]
    end = post [ a + 1 : len ( post ) ]
    ans = ''
    if len ( post ) == length :
        if c == '-' :
            if '-' in start or '-' in end :
                ans = 'No'
            else :
                ans = 'Yes'
        else :
            ans = 'No'
    else :
        ans = 'No'
    print ( ans )
