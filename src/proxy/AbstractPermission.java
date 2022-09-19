package proxy;

public interface AbstractPermission {

	void modifyUserInfo();

	void viewNote();

	void publishNote();

	void modifyNote();

	void setLevel(int level);
}