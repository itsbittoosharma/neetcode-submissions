class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        if(s.size()%2!=0) return false;
        for(char c:s)
        {
            if(st.empty())
            {
                if(isClosing(c)) return false;
                else
                {
                    st.push(c);
                }
            } 

            else
            {
                if(isClosing(c))
                {
                    if(st.top() == getOpening(c))
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    st.push(c);
                }
            }
            

        }

        return !st.size();
    }

    bool isClosing(char c)
    {
        if(c=='('||c=='{'||c=='[')
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    char getOpening(char c)
    {
        if(c==')')
        {
            return '(';
        }
        else if(c=='}')
        {
            return '{';
        }
        else
        {
            return '[';
        }
    }
};
