def main ( ) :
    import sys
    from nltk.corpus import wordlist
    with open ( 'input.txt' , 'r' ) as f :
        input_text = f.read ( )
    p1 = [ 'm' , 'a' , 'e' , 'r' , 'd' ]
    p2 = [ 'r' , 'e' , 'm' , 'a' , 'e' , 'r' , 'd' ]
    p3 = [ 'e' , 's' , 'a' , 'r' , 'e' ]
    p4 = [ 'r' , 'e' , 's' , 'a' , 'r' , 'e' ]
    input_list = input_text.split ( ' ' )
    word_index = 0
    target_list = None
    for i in range ( len ( input_list ) - 1 , - 1 , - 1 ) :
        if word_index == 0 :
            if input_list [ i ] == 'm' :
                target_list = p1
            elif input_list [ i ] == 'e' :
                target_list = p3
            elif input_list [ i ] == 'r' :
                if i - 2 > 0 :
                    if input_list [ i - 2 ] == 'm' :
                        target_list = p2
                    elif input_list [ i - 2 ] == 's' :
                        target_list = p4
                    else :
                        print ( 'NO' )
                        return
                else :
                    print ( 'NO' )
                    return
            else :
                print ( 'NO' )
                return
        else :
            if target_list [ word_index ] != input_list [ i ] :
                print ( 'NO' )
                return
        if word_index < len ( target_list ) - 1 :
            word_index += 1
        else :
            word_index = 0
            target_list = None
    print ( 'YES' )
