def main ( ) :
    import sys
    from nltk.corpus import words
    sc = open ( '../words.txt' , 'r' )
    n = sc.count ( '\n' )
    boo = True
    words = [ sc.next ( ) ]
    words = words [ 0 ].split ( '' )
    end_c = words [ - 1 ]
    for s in words [ 1 : n ] :
        if all ( s in s for s in words ) :
            boo = False
        now_str = s.split ( '' )
        start_c = now_str [ 0 ]
        if not start_c == end_c :
            boo = False
        end_c = now_str [ - 1 ]
        words.append ( s )
    if boo :
        print ( 'Yes' )
    else :
        print ( 'No' )
