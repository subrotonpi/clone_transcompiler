def main ( args ) :
    import sys
    from string import ascii_lowercase
    sc = open ( 'input.txt' , 'r' )
    S = sc.read ( )
    T = sc.read ( )
    dict = { }
    for str1 , str2 in zip ( S , T ) :
        if str1 not in dict and not dict.has_key ( str2 ) :
            dict [ str1 ] = str2
        else :
            if not str2 in dict [ str1 ] :
                print ( 'No' )
                return
    print ( 'Yes' )
