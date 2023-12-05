def import sys , flag :
    from os import path
    with open ( path.join ( path.dirname ( __file__ ) , ".." , ".." , ".." , ".." , ".." ) , "r" ) as sc :
        bodies = [ ]
        voted = [ ]
        for temp in path.split ( "\n" ) :
            try :
                for i in range ( len ( bodies ) ) :
                    if bodies [ i ] == temp :
                        voted [ i ] += 1
                        continue flag
            except AttributeError :
                bodies [ last_element ] = temp
                voted [ last_element ] += 1
                last_element += 1
        most_voted = 0
        most_voted_body = 0
        for i in range ( len ( voted ) ) :
            if voted [ i ] > most_voted :
                most_voted = voted [ i ]
                most_voted_body = i
        print ( bodies [ most_voted_body ] )
